def call(Closure body) {
    int a = 2
    if (a<100) { 
        //If the condition is true print the following statement 
        println("The value is less than 100");
        body()
    }
    else {
        println("random text");
            body()
    }
}
