package Core
import Core.ContentList

class ListInput {

    fun input(): String{
        val listTask = ContentList(content = readln())
        return listTask.content
    }

}

class listStats{

    fun HeadStats(HeadDeaful: Boolean = false): Boolean{
        var head = HeadDeaful
        return head
    }

}
