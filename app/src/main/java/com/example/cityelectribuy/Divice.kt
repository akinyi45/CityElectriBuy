package com.example.cityelectribuy

class Divice {
     var model: String = ""
     var color: String = ""
     var regNo: String = ""
     var price: String = ""
     var image: String = ""
     var id: String = ""

    constructor(
        model: String,
        color: String,
        regNo: String,
        price: String,
        image: String,
        id: String
    ) {
        this.model = model
        this.color = color
        this.regNo = regNo
        this.price = price
        this.image = image
        this.id = id
    }
    constructor()
}