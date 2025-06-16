package Core
import Core.ListInput
import Core.listStats
import com.sun.net.httpserver.Headers

class listView {

    fun inputTask1(): String{
        print("Tarefa 1:")
        val task1 = ListInput().input()
        return task1
    }

    fun inputTask2(): String{
        print("Tarefa 2:")
        val task2 = ListInput().input()
        return task2
    }

    fun inputTask3(): String{
        print("Tarefa 3:")
        val task3 = ListInput().input()
        return task3
    }

    fun inputTask4(): String{
        print("Tarefa 4:")
        val task4 = ListInput().input()
        return task4
    }

    fun inputTask5(): String{
        print("Tarefa 5:")
        val task5 = ListInput().input()
        return task5
    }

}

fun addHead(){
    var t1 = listView().inputTask1() + listStats().HeadStats(true)
    var t2 = listView().inputTask2() + listStats().HeadStats(false)
    var t3 = listView().inputTask3() + listStats().HeadStats(false)
    var t4 = listView().inputTask4() + listStats().HeadStats(false)
    var t5 = listView().inputTask5() + listStats().HeadStats(false)

}
