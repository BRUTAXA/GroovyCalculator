class Calculator2 {

    static void main(String[] args) {

        println('Select + for Add');
        println('Select - for Sub');
        println('Select * for Multiply');
        println('Select / for Div');
        def operator = System.in.newReader().readLine();

        println('Enter first number')
        def number1 = System.in.newReader().readLine()
        number1 = number1.replaceAll("[^0-9]" , "")
        number1 = Double.parseDouble(number1)

        println('Enter second number')
        def number2 = System.in.newReader().readLine()
        number2 = number2.replaceAll("[^0-9]" , "")
        number2 = Double.parseDouble(number2)

        switch (operator) {
            case '+':
                println(number1 + number2);
                break;
            case '-':
                println(number1 - number2);
                break;
            case '*':
                println(number1 * number2);
                break;
            case '/':
                println(number1 / number2);
                break;
        }
    }


}
