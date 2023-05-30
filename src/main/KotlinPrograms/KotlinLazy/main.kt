package KotlinLazy

private const val SALARY_THRESHOLD = 100
private val taxCollector = TaxCollector()
private  val accountant by lazy {
    Accountant()
}

fun main() {

    val salaries  = listOf(50,190,70)
    for(salary in salaries){
        taxCollector.payTaxes(salary)
        if (salary > SALARY_THRESHOLD){
            accountant.findTaxSaving()
        }
    }

}