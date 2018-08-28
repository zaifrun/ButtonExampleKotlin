package org.pondar.buttonexamplekotlin

open class Person(var name:String,var age:Int)
{

    constructor(name:String) : this(name,0)

    override fun toString(): String {
        return name+" "+age
    }
}
