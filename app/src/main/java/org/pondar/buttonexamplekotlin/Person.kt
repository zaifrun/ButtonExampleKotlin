package org.pondar.buttonexamplekotlin

data class Person(val name:String, val age:Int)

open class Person2(var name:String,var age:Int)
{

    constructor(name:String) : this(name,0)

    override fun toString(): String {
        return name+" "+age
    }
}
