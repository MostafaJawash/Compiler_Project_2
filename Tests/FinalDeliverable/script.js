// Client-side simulation of "add" and "edit" for this statically generated
// site (there is no live server to persist data to). Everything here lives
// in this browser's localStorage only - it does not survive a different
// browser/device, and disappears if the user clears site data.

function tierInfo(price) {
    if (price >= 500) return { cls: "premium", label: "Premium" };
    if (price >= 100) return { cls: "standard", label: "Standard" };
    return { cls: "budget", label: "Budget" };
}

function readJSON(key, fallback) {
    try {
        var raw = localStorage.getItem(key);
        return raw ? JSON.parse(raw) : fallback;
    } catch (e) {
        return fallback;
    }
}

function writeJSON(key, value) {
    try {
        localStorage.setItem(key, JSON.stringify(value));
    } catch (e) {
        // localStorage unavailable (private browsing, quota, ...) - fail silently,
        // the simulated add/edit simply won't persist for this session.
    }
}

// ---------- index.html: render any locally-added products on top of the generated ones ----------

function renderAddedProducts() {
    var grid = document.querySelector(".products");
    if (!grid) return;

    var added = readJSON("addedProducts", []);
    added.forEach(function (product) {
        var tier = tierInfo(product.price);

        var card = document.createElement("article");
        card.className = "product-card";

        if (product.imageData) {
            var img = document.createElement("img");
            img.className = "product-image";
            img.src = product.imageData;
            img.alt = product.name;
            card.appendChild(img);
        }

        var h3 = document.createElement("h3");
        h3.textContent = product.name;
        card.appendChild(h3);

        var desc = document.createElement("p");
        desc.className = "description";
        desc.textContent = product.description;
        card.appendChild(desc);

        var priceRow = document.createElement("div");
        priceRow.className = "price-row";

        var price = document.createElement("p");
        price.className = "price " + tier.cls;
        price.textContent = "$" + product.price + " - " + tier.label;
        priceRow.appendChild(price);

        card.appendChild(priceRow);

        grid.appendChild(card);
    });
}

// ---------- add_product.html: capture the form and simulate saving a new product ----------

function initAddForm() {
    var form = document.querySelector(".form-card");
    if (!form) return;

    form.addEventListener("submit", function (event) {
        event.preventDefault();

        var name = form.querySelector('input[name="name"]').value.trim() || "Untitled Product";
        var description = form.querySelector('textarea[name="description"]').value.trim();
        var price = parseFloat(form.querySelector('input[name="price"]').value) || 0;
        var fileInput = form.querySelector('input[name="image"]');
        var file = fileInput && fileInput.files && fileInput.files[0];

        function finish(imageData) {
            var added = readJSON("addedProducts", []);
            added.push({
                id: "local-" + Date.now(),
                name: name,
                description: description,
                price: price,
                imageData: imageData
            });
            writeJSON("addedProducts", added);
            window.location.href = "index.html";
        }

        if (file) {
            var reader = new FileReader();
            reader.onload = function () { finish(reader.result); };
            reader.onerror = function () { finish(null); };
            reader.readAsDataURL(file);
        } else {
            finish(null);
        }
    });
}

// ---------- edit_product_N.html: capture the form and simulate saving changes ----------

function initEditForm() {
    var form = document.querySelector(".form-card");
    if (!form) return;

    var productId = form.getAttribute("pid");
    var detailPage = form.getAttribute("page");

    form.addEventListener("submit", function (event) {
        event.preventDefault();

        var name = form.querySelector('input[name="name"]').value.trim();
        var description = form.querySelector('textarea[name="description"]').value.trim();
        var price = parseFloat(form.querySelector('input[name="price"]').value) || 0;

        var edits = readJSON("productEdits", {});
        edits[productId] = { name: name, description: description, price: price };
        writeJSON("productEdits", edits);

        window.location.href = detailPage;
    });
}

// ---------- product_detail_N.html: apply any saved edit on top of the generated content ----------

function applyProductEditOverride() {
    var card = document.querySelector(".detail-card[pid]");
    if (!card) return;

    var productId = card.getAttribute("pid");
    var edits = readJSON("productEdits", {});
    var edit = edits[productId];
    if (!edit) return;

    var nameEl = card.querySelector(".detail-info h2");
    var descEl = card.querySelector(".detail-info .description");
    var priceEl = card.querySelector(".detail-info .price");

    if (nameEl) nameEl.textContent = edit.name;
    if (descEl) descEl.textContent = edit.description;
    if (priceEl) {
        var tier = tierInfo(edit.price);
        priceEl.className = "price " + tier.cls;
        priceEl.textContent = "$" + edit.price + " - " + tier.label;
    }
}

document.addEventListener("DOMContentLoaded", function () {
    var page = document.body.id;
    if (page === "page-index") renderAddedProducts();
    if (page === "page-add-product") initAddForm();
    if (page === "page-edit-product") initEditForm();
    if (page === "page-product-detail") applyProductEditOverride();
});
