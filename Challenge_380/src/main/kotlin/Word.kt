class Word(val string:String) {
   override fun hashCode(): Int {
      return string.hashCode()
   }

   override fun equals(other: Any?): Boolean {
      if(other==null) return false
      if(other !is Word) return false
      return other.string == this.string
   }
}