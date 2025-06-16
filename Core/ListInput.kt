package Core
import Core.ContentList

class ListInput {

    fun input(): String{
        val listTask = ContentList(content = readln())
        return listTask.content
    }

}

class listStats{

    fun HeadStats(HeadDeaful: Boolean = false): String{
        var head: Boolean = HeadDeaful
        var confirm1: String = ""
        var ver = ""
        if (head == true){
            val confirm1: String  = "🟢"
            var ver = println(confirm1)
        }else if (head == false){
           val confirm1: String = "🔴"
           var ver = println(confirm1)

        }
        return ver

    }

}
