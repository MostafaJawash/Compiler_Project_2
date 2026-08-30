from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

products = [
    {
        "id": 1,
        "name": "Wireless Headphones",
        "price": 59,
        "description": "Playful cat-ear design with a soft padded headband, built for comfortable all-day listening.",
        "image_path": "static/images/headphones.png",
        "detail_page": "product_detail_1.html",
        "edit_page": "edit_product_1.html"
    },
    {
        "id": 2,
        "name": "Smart Watch",
        "price": 199,
        "description": "Touchscreen fitness companion with heart-rate tracking, step counting, and multi-day battery life.",
        "image_path": "static/images/smartwatch.png",
        "detail_page": "product_detail_2.html",
        "edit_page": "edit_product_2.html"
    },
    {
        "id": 3,
        "name": "Air Fryer",
        "price": 89,
        "description": "Digital air fryer with one-touch presets for crispy results using little to no oil.",
        "image_path": "static/images/air-fryer.png",
        "detail_page": "product_detail_3.html",
        "edit_page": "edit_product_3.html"
    },
    {
        "id": 4,
        "name": "Water Dispenser",
        "price": 149,
        "description": "Free-standing hot and cold water dispenser with dual taps, built for home or office use.",
        "image_path": "static/images/water-dispenser.png",
        "detail_page": "product_detail_4.html",
        "edit_page": "edit_product_4.html"
    },
    {
        "id": 5,
        "name": "Apple TV Streaming Box",
        "price": 149,
        "description": "Compact streaming box with a voice remote for movies, shows, and apps on the big screen.",
        "image_path": "static/images/apple-tv.png",
        "detail_page": "product_detail_5.html",
        "edit_page": "edit_product_5.html"
    },
    {
        "id": 6,
        "name": "Mirrorless Camera",
        "price": 1899,
        "description": "Full-frame mirrorless camera with a versatile zoom lens for photography and video.",
        "image_path": "static/images/camera.png",
        "detail_page": "product_detail_6.html",
        "edit_page": "edit_product_6.html"
    },
    {
        "id": 7,
        "name": "All-in-One Printer",
        "price": 249,
        "description": "Print, scan, and copy in color with a refillable ink tank system built for low running costs.",
        "image_path": "static/images/printer.png",
        "detail_page": "product_detail_7.html",
        "edit_page": "edit_product_7.html"
    }
]


@app.route("/")
def index():
    return render_template("index.jinja", products=products)


@app.route("/add")
def add_product():
    return render_template("add_product.jinja")


@app.route("/product/1")
def product_detail_1():
    product = products[0]
    return render_template("product_detail_1.jinja", product=product)


@app.route("/product/2")
def product_detail_2():
    product = products[1]
    return render_template("product_detail_2.jinja", product=product)


@app.route("/product/3")
def product_detail_3():
    product = products[2]
    return render_template("product_detail_3.jinja", product=product)


@app.route("/product/4")
def product_detail_4():
    product = products[3]
    return render_template("product_detail_4.jinja", product=product)


@app.route("/product/5")
def product_detail_5():
    product = products[4]
    return render_template("product_detail_5.jinja", product=product)


@app.route("/product/6")
def product_detail_6():
    product = products[5]
    return render_template("product_detail_6.jinja", product=product)


@app.route("/product/7")
def product_detail_7():
    product = products[6]
    return render_template("product_detail_7.jinja", product=product)


@app.route("/edit/1")
def edit_product_1():
    product = products[0]
    return render_template("edit_product_1.jinja", product=product)


@app.route("/edit/2")
def edit_product_2():
    product = products[1]
    return render_template("edit_product_2.jinja", product=product)


@app.route("/edit/3")
def edit_product_3():
    product = products[2]
    return render_template("edit_product_3.jinja", product=product)


@app.route("/edit/4")
def edit_product_4():
    product = products[3]
    return render_template("edit_product_4.jinja", product=product)


@app.route("/edit/5")
def edit_product_5():
    product = products[4]
    return render_template("edit_product_5.jinja", product=product)


@app.route("/edit/6")
def edit_product_6():
    product = products[5]
    return render_template("edit_product_6.jinja", product=product)


@app.route("/edit/7")
def edit_product_7():
    product = products[6]
    return render_template("edit_product_7.jinja", product=product)

# Note: no "if __name__ == '__main__': app.run(...)" guard here on purpose -
# GenerationPipeline interprets this file directly (there is no real Python
# runtime involved), and __name__ is never bound by the interpreter, so
# evaluating that guard's condition would abort the whole run.
