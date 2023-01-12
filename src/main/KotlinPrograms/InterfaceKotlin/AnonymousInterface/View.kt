package InterfaceKotlin.AnonymousInterface

open abstract class View (){

    lateinit var clickListener : onClickListener

    fun setMyListener(clickListener: onClickListener) {
        this.clickListener =clickListener
    }
    fun click(){
        clickListener.onClick()
    }
}
class Button : View()
class Image : View()

