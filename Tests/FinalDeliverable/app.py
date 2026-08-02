from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

products = [
    {
        "id": 1,
        "name": "Wireless Headphones",
        "price": 85
    },
    {
        "id": 2,
        "name": "4K Ultra HD Monitor",
        "price": 650
    },
    {
        "id": 3,
        "name": "Mechanical Keyboard",
        "price": 120
    }
]


@app.route("/")
def index():
    return render_template("index.jinja", products=products)


@app.route("/add")
def add_product():
    return render_template("add_product.jinja")


@app.route("/edit")
def edit_product():
    product = products[1]
    return render_template("edit_product.jinja", product=product)

# Note: no "if __name__ == '__main__': app.run(...)" guard here on purpose -
# GenerationPipeline interprets this file directly (there is no real Python
# runtime involved), and __name__ is never bound by the interpreter, so
# evaluating that guard's condition would abort the whole run.
