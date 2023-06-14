fun main() {
    var myStack = Stack()

    myStack.push(19)
    myStack.push(36)
    myStack.push(6)

    println(myStack.peek())
    println(myStack.pop())
    println(myStack.peek())

    myStack.push(13)
    myStack.push(14)
    myStack.push(46)

    var x = myStack.pop()
    var y = myStack.pop()
//   use !! which are null accerssion operators
    var z = x!!+y!!
    println(z)







}

class Stack{
    var data = mutableListOf<Int>()

    fun push (value:Int){
        data.add(value)
    }
    fun pop():Int?{
        if(data.isEmpty()){
            return null
        }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }

    fun peek():Int?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }

    fun isEmpty():Boolean{
        return data.isEmpty()
    }


}