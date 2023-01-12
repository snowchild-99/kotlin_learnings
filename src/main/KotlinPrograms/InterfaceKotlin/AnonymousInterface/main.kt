package InterfaceKotlin.AnonymousInterface


fun main() {
   var button = Button()
    button.setMyListener(object: onClickListener {
        override fun onClick() {
            println("clicked")
        }
    })
    button.click()
}