import java.util.HashSet

fun main(){
   val wordFileLines = {}.javaClass.getResource("enable1.txt").readText().lines()
   val words = HashSet<Word>()
   wordFileLines.forEach {
      words.add(Word(it))
   }
   println("Hello World!")
}