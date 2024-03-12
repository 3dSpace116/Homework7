public class Main {
    public static void main(String[] args) {

//Задача 1

        float deposit = 0f;            //общие накопления, сбережения
        int salary = 15000;            //ежемесячная зарплата, прибыль, доход
        int monthCount = 0;            //номер месяца
        float percent = 1.01f;         //коэффициент прибыли 1% в месяц

        while (deposit < 2459000) {
            deposit = deposit * percent + salary;               //расчет депозита с учетом процента за прошлый месяц и новых вложений
            monthCount++;                                       //счетчик месяцев

            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + deposit + " рублей");  //вывод ежемесячного результата
        }
        System.out.println("Чтобы накопить " + deposit + " рублей, необходимо " + monthCount + " месяцев"); //вывод общего результата

//Задача 2

        int i = 0;

        while (i < 10) {                                    //считаем до 10
            i++;
            System.out.print(i + " ");
        }

        System.out.println();                               //переход на новую строку
        for (i = 10; i > 1; i--) {                          //считаем до 10
            System.out.print(i + " ");
        }

//и решим "неправильно", чтобы было в обе стороны оба цикла
        System.out.println();                                //перенос строки, чтобы отойти от прошлого варианта решения

        for (i = 1; i <= 10; i++) {                          //считаем до 10
            System.out.print(i + " ");
        }
        System.out.println();                                //перенос строки

        while (i > 1) {                                      //обратный отсчет
            i--;
            System.out.print(i + " ");
        }

//Задача 3
        System.out.println();                               //перенос строки, чтобы отойти от прошлой задачи
        int population = 12000000;                          //всего населения
        int birthRate = 17;                                 //рождаемость на 1000 человек
        int deathRate = 8;                                  //смертность на 1000
        int yearCount = 0;                                  //счетчик лет

        while (yearCount < 10) {                            //условие, которое позволит сделать расчет на 10 лет
            yearCount++;                                    //считаем 10 циклов
            population = population + population * birthRate / 1000 - population * deathRate / 1000;      //в каждом цикле плюсуем рождаемость и отнимаем смертность
            System.out.println("Год " + yearCount + ", население составляет " + population);              //вывод результата ежегодно, внутри цикла
        }

//Задача 4

        deposit = 15000f;
        percent = 1.07f;
        monthCount = 0;                                 //переменные из прошлых задач, которым присвоены новые значения

        while (deposit < 12000000) {                    //условие будет выполняться, пока депозит менее 12 млн.
            monthCount++;                               //счетчик месяцев
            deposit = deposit * percent;                //Бизин скажет что надо было процент умножать на депозит, а не наоборот
            // P.S совпадения случайны
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + deposit);                 //стандартно и грустно, вывод внутри цикла ежемесячно
        }
        System.out.println("Чтобы накопить " + deposit + ", Василию понадобится " + monthCount + " месяц");    //вывод в терминал страшной цифры 1.2164307E7

        System.out.printf("Месяц %d: сумма накоплений составляет %.2f рублей%n", monthCount, deposit);         //в комментариях к уроку найден printf,
        // но мне ничего не понятно, что за %, d,f, ясно только количество знаком после запятой- 2

        String str = String.format("Привет - %s! Как дела %s?", "Саша", "на работе");  //находим такой пример, видно объявление строки (мы их не проходили, я могу ошибаться)
        // в которой сначала общее выражение со ссылками %s, и после идут символы, которые будут использованы, в данном случае "Саша" и "на работе".

        System.out.println(str); //и команда вывода строки, но она эквивалентна следующей
        System.out.printf("Привет - %s! Как дела %s?", "Саша", "на работе");
        // почему у нас d и f(логично что float), а тут s, и какие они вообще бывают? s-string(слово, фраза) d-наверно digit, цифра (все целочисленные), f-с плавающей запятой,
        //b-boolean (двоичные, 0 и 1, true/false) с-char (символьные, хранят только один символ для экономии памяти, нужны чтобы путать программистов, например char d="a" и теперь думай что писать, d или а)
        //t-time, думал я, но нет, date! и %, чтобы привлечь внимание этой глупой программы, ведь она не поймет что мы хотим от нее, чтобы она обратилась к символам.
        //попробуем в деле это мощное оружие, учитывая что сначала идет формулировка, а потом через запятую идут все перечисляемые фразы по порядку.
        System.out.println(); //но сначала сдвинем строку

        System.out.printf("Дмитрий утверждает, %s свое мнение, однако повторяет свою фразу %.0f раз, и %s, что это false", "что не навязывает", deposit, "складывается ощущение"); //все персонажи выдуманы, совпадения случайны


//Задача 5
        System.out.println();//после printf нужна новая строка

        deposit = 15000f;
        percent = 1.07f;
        monthCount = 0;                                //значения необходимо сбросить


        while (deposit < 12000000) {                   //условие будет выполняться, пока депозит менее 12 млн.
            monthCount++;                              //счетчик месяцев
            deposit = deposit * percent;
            if (monthCount % 6 == 0) {                 //банальное и скучное решение, но в уроке были break  continue, и мне нужно попробовать их, поэтому...
                System.out.printf("Месяц %d: сумма накоплений составляет %.2f рублей%n", monthCount, deposit);
            }
        }
        System.out.printf("Чтобы накопить %.2f , Василию понадобится %d месяцев", deposit, monthCount);

//...решим "неправильно", чтобы попробовать хотя бы break

        System.out.println();//после printf нужна новая строка

        deposit = 15000f;
        percent = 1.07f;
        monthCount = 0;                                  //значения необходимо сбросить

        while (true) {                                   //запускаем бесконечный цикл
            monthCount++;                                //считаем месяцы
            deposit = deposit * percent;                 //получаем проценты по вкладу

            if (monthCount % 6 == 0) {                   //условие для вывода каждые 6 месяцев
                System.out.printf("Месяц %d: сумма накоплений составляет %.2f рублей%n", monthCount, deposit);

                if (deposit >= 12000000) {               //выход из бесконечного цикла, как только достигнута нужная сумма депозита
                    break;
                }
            }
        }
        System.out.printf("Чтобы накопить %.2f , Василию понадобится %d месяцев", deposit, monthCount); //вывод финального сообщения
        System.out.println();//после printf нужна новая строка

//Задача 6

        yearCount = 9;                                    //количество лет вклада
        int month = 12;                                   //количество месяцев в году
        int monthTotal = yearCount * month;               //общий срок вклада, выраженный в месяцах
        deposit = 15000;                                  //вернем значение депозита к исходному после решения прошлой задачи
        percent = 1.07f;                                  //процент не меняется, но переменную хотел держать перед глазами. Димка, что ты говоришь? Опять неправильно?

        for (i = 1; i <= monthTotal; i++) {               //цикл для ежемесячных операций на всю длительность времени вклада
            deposit = deposit * percent;                  //каждый месяц получаем проценты

            if (i % 6 == 0) {                             //условие для вывода данных каждые пол-года. Димка, полгода это 6 месяцев! Цифра взята из общедоступных данных!
                System.out.printf("Месяц %d: сумма накоплений составляет %.2f рублей%n", i, deposit);
            }
        }
        System.out.printf("Общая сумма накоплений составляет %.2f рублей%n", deposit); //вывод общего результата

//Задача 7

        int firstFriday = 3;      //дата первой пятницы, ДИМКААА, из головы взята цифра, представляешь? В задаче так сказано, брать любую первую дату.
        int monthDays = 31;       //всего дней в месяце

        for (i = firstFriday; i <= monthDays; i += 7) {   //цикл запускается каждые 7 дней, пока не достигнет максимального значения
            System.out.printf("Пятница,  %d-е число, необходимо составить отчет%n", i);
        }

//Если ты, уважаемый проверяющий, дочитал до конца и хочешь знать, что за вакханалия тут происходит, то в одной из первых ДЗ ментор был не в состоянии вникнуть в код и условия задачи и
//делал замечание по поводу переменных, которые надо брать из головы, подразумевается что из будет вводить пользователь.

//Он дал замечательный совет как писать код, который изначально написан по конструкции как он предлагает.
//https://github.com/3dSpace116/Homework4/pull/1

//Поэтому он навсегда останется в моем коде и моей памяти ))

    }
}