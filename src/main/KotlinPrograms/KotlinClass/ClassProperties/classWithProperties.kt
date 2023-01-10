package KotlinClass.ClassProperties

//Program of Default Setter and Getter
class classWithProperties (var firstname: String, var lastName : String){

        var fullName : String = "$firstname $lastName"
            get() = "Full Name : $field"  // getter
            set(value) {     // setter
                if(value.startsWith("Sandeep")){
                    field ="Mandeep Yadav"
                }
            }



}