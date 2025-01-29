public class Main 
{   /* Per iniziare un file java 
    bisogna creare una classe con lo stesso nome del file */
    
    public static void main(String[] args)  
    {
        // Stampa a video il messaggio con a capo
        System.out.println("Hello World");  
        
        // Stampa a video il messaggio senza a capo
        System.out.print("Hello world! ");  

        // Stampa a video il messaggio sulla stessa riga del precedente
        System.out.println("I will print on the same line. ");
        


        /*  Per scrivere i numeri nel print non bisogna mettere le virgolette 
        e si possono fare operazioni matematiche 
        Per aggiungere anche una stringa bisogna aggiungere un +    */
        System.out.println("La somma è = "+ 5 * 5 + "$");
        System.out.println(3 + 3);
        System.out.println(2004);



        // Le variabili sono: int, double, float, char, boolean, String
        int myNum = 5;
        double numero2 = 5.5;
        float numero3 = 5.5f;
        char carattere = 'a';
//      boolean vero = true;
        String stringa = "Ciao";
        System.out.println(myNum+numero2+numero3+carattere+stringa);


        /* Per dichiarare una costante si usa la parola chiave final 
        e non si può cambiare il valore         */
        final int costante = 5;
        System.out.println(costante);

        // Per dichiarare più variabili dello stesso tipo 
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        
        // Per dichiarare più variabili dello stesso tipo con lo stesso valore
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);



        // I boolean serve per dare ad una variabile true o false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);      // output true
        System.out.println(isFishTasty);    // output false



        // Esercizio usando int, float e char
        int prodotto = 30;
        float costoUnitario = 3.99f;
        float costoTotale = prodotto * costoUnitario; 
        char valuta = '€';
        System.out.println("Numero prodotti: " + prodotto);
        System.out.println("Il costo unitario è di: " + costoUnitario + valuta);
        System.out.println("Il costo totale è di: " + costoTotale + valuta);



        // Nel println si possono fare delle verifiche con output true o false
        int g = 5;
        int h = 3;
        System.out.println(g > h); // in questo caso è true



        // le varie operazioni che si possono fare con una stringa 
        String txt = "Hello world!";
        
        // Per sapere quanti caratteri ha una stringa bisogna fare .length
        System.out.println("La lunghezza della stringa " + txt + " è di: " + txt.length()); 
        
        // questa stringa e tutto in maiuscolo e si usa .toUpperCase
        System.out.println("Questa stringa è scritto tutto maiuscolo: " + txt.toUpperCase());
        
        // Questa stringa e tutto in minuscolo e si usa .toLowerCase
        System.out.println("Questa stringa è scritto tutto minuscolo: " + txt.toLowerCase());
        
        /* The indexOf() method returns the index (the position) 
        of the first occurrence of a specified text in a string (including whitespace): */
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7



        // Per unire 2 stringhe
        String firstName = "Fabian ";
        String lastName = "Ghioca";
        System.out.println(firstName + "" + lastName);
        // Si può utilizzare anche il .concat
        System.out.println(firstName.concat(lastName));
        


        // Il risultato è la somma di num1 e num2 = 30 
        int num1 = 10;
        int num2 = 20;
        int num1num2 = num1 + num2;
        System.out.println(num1num2);

        /* Se si aggiungono due stringhe, 
        il risultato sarà una concatenazione di stringhe: 1020 */
        String str1 = "10";
        String str2 = "20";
        String str1str2 = str1 + str2;
        System.out.println(str1str2);

        /* Se si aggiunge un numero e una stringa, 
        il risultato sarà una concatenazione di stringa: 1020 */
        String str3 = "10";
        int num3 = 20;
        String str3num3 = str3 + num3;
        System.out.println(str3num3);



        // Per scrivere caratteri speciali
        // Per aggiungere le "" si usa  \"
        String txt1 = "We are the so-called \"Vikings\" from the north.";
        // Per aggiungere ' si usa  \'
        String txt3 = "It\'s alright.";
        // Per aggiungere un \ si usa  \\
        String txt4 = "The character \\ is called backslash.";

        String txt134 = txt1+txt3+txt4;
        System.out.println(txt134); 

    /*  \n 	    New Line 	
        \r 	    Carriage Return 	
        \t 	    Tab 	
        \b 	    Backspace 	
        \f 	    Form Feed               */

        // Trovare il valore massimo
        Math.max(5, 10);
        // Trovare il valore minimo
        Math.min(5, 10);
        // Radice quadrata di un valore
        Math.sqrt(64);
        // Trasformare un valore negativo in positivo
        Math.abs(-4.7);
        // Generare un numero casuale da 0.0 a 1.0
        Math.random();
        // Per generare un numero casuale fino a 100
        int randomNum = (int)(Math.random() * 101);
        System.err.println(randomNum);













    }
}
