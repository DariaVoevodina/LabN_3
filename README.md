# Отчет по лабораторной работе № 3

#### № группы: ` ПМ-2401`

#### Выполнил: `Воеводина Дарья Андреевна`

#### Вариант: `4`

### Cодержание:

- [Постановка задачи](#1-постановка-задачи)
- [Входные и выходные данные](#2-входные-и-выходные-данные)
- [Математическая модель](#25-математическая-модель)
- [Выбор структуры данных](#3-выбор-структуры-данных)
- [Алгоритм](#4-алгоритм)
- [Программа](#5-программа)
- [Анализ правильности решения](#6-анализ-правильности-решения)

### 1. Постановка задачи

- Условия задачи

>Разработать систему управления списком покупок с функциями анализа бюджета и
стоимости товаров. Обеспечить возможность работы с данными о товарах, их ценах и
доступных средствах, включая проверку соответствия стоимости покупок бюджету.


- Для выполнения задач необходимо создать 2 класса:покупка(Shop) и список покупок(List_of_shops)
  Shop:
- Поля класса содержат название, цену, статус(куплено/не куплено), количесиво
- В конструкторе задаются параметры, введенной покупки
- Переделанный метод toString для вывода информации о покупки.
  List_of_shops:
- Поля класса содержат массив с элементами типа Shop, а также начальную сумму, имеющиеся для совершения покупок
- В конструкторе задаётся изначальная стоимость 0, а также новый массив длинной 10
- Далее описывается метод addList для добавления покупок в список
- Затем методы для увеличения бюджета, совершения покупки, общей стоимости списка, стоимости некупленных товаров, подсчёта недостающей стоимости, попытки купить все, сортировка списка товаров по возрастнаию и убыванию цены, нахождения самого дешёвого и дорого товара, подсчёт количества товаров, которые можно купить с учётом бюджета

### 2. Входные и выходные данные

#### Данные на вход


||


#### Данные на выход




### 3. Выбор структуры данных


### 4. Алгоритм

#### Описание классов:
Class Shop:
1. Поля:
   -private String name используем тип данны String, тк название покупки строка
   -public int price используем тип данных price, тк стоимость покупки целое число,public тк в процессе работы в классе List_of_shops необходимо будет его использовать
   -public String status используем String, тк куплено/не куплено определяется строкой "YES"/"NO", public тк в процессе работы в классе List_of_shops необходимо будет его изменять, после покупки товара
   -public int count используем тип данных int, тк количество является целым числом,public тк в процессе работы в классе List_of_shops необходимо будет его использовать
2. Конструктор
   -задаём изначальные значения, name всегда остаётся таким каким есть
   -price, если оказывается <=0, то ставим значение 1, тк не может быть цена <=0
   -статус остаётся таким, каким его сделал пользователь
   -количество не может быть непложительным числм, следовательно, если оно такое, то ставим значение 1
3. метод toString
   -переписываем метод toString, для красивого вывода информации о покупке
   Class List_of_shops
1. Поля:
   -private Shop[] list массив list, содержащий покупки - Shop
   -private int sum - бюджет, который есть на покупки
2. Конструктор
   -создаём "нулевой" массив длины 100(большое количество пунктов, при добавлении новых покупок в список он будет изменяться, "нулевые" позиции превращаются в сами покупки)
   -сумму изначально задаём 0
3. Метод list() будет возвращать массив из покупок в виде красивого списка
4. Метод addShop(Shop x)позволяет добавлять покупку в общий список покупок
5. Метод addMoney(int x) позволяет увеличивать изначальный бюджет на покпку товаров
6. Метод mayBuy позволяет оценить возможность покупки того или иного товара в зависимости от его цены и необходимого количесива
7. Метод buyShop позволяет купить товар из списка, меняется статус товара в списке, а также уменьшается бюджет
8. Метод sumShops позволяет посчитать общую сумму товаров в списке покупок
9. Метод sunNotBuyingShop вычисляет стоимость покупок, кототрые не куплены
10. Метод mayBuyAll проверяет возможность купить все покупки из списка, независимо от их статуса
11. Метод notEnoughMoney подсчитывает количество недостающих средств для покупки всего списка
12. Метод buyAll - попытка купить весь список, если средств недостаточно, то высветится сообщение, о том что нельзя купить весь список, иначе статус всех покупок измениться на куплено и сумма бюджета уменьшется на сумму всего списка
13. Метод sortListIncreasing сортирует список пузырьком по возрастаню стоимости на продукты в списке
14. Метод sortListDecreasing сортирует список пузырьком по убыванию стоимости продуктов
15. Метод mayBuyAmount возвращает количество товаров, которое пользователь может купить
16. Метод theCheapest возвращает самый дешёвый товар в списке
17. Метод theMostExpensive возвращает самый дорогой това в списке


### 5. Программа

Полный текст программы с комментариями на русском языке



```java
public class Main {
    public static void main(String[] args) {
        List_of_shops s=new List_of_shops();
        Shop shop1=new Shop("Milk",100,"NO",1);
        Shop shop2=new Shop("Bread",70,"NO",1);
        Shop shop3=new Shop("Earrings",50000,"NO",1);
        Shop shop4=new Shop("Iphone 15 Pro",100000,"NO",1);
        Shop shop5=new Shop("Sweets",100,"NO",1);
        Shop shop6=new Shop("Tomatoes",50,"NO",3);
        s.addShop(shop5);
        s.addShop(shop6);
        s.addShop(shop4);
        s.addShop(shop1);
        s.addShop(shop2);
        s.addShop(shop3);
        s.addMoney(500);
        s.buyShop(shop1);
        System.out.println(s.list());
        System.out.println(s.mayBuy(shop1));
        System.out.println(s.sumShops());
        System.out.println(s.sumNotBuyingShops());
        System.out.println(s.mayBuyAll());
        System.out.println(s.notEnoughMoney());
        System.out.println(s.buyAll());
        System.out.println(s.list());
        s.sortListIncreasing();
        System.out.println(s.list());
        System.out.println(s.mayBuyAmount());
        s.sortListDecreasing();
        System.out.println(s.list());
        System.out.println(s.theMostExpensive());
        System.out.println(s.theCheapest());
    }
}
class Shop{//Создаем класс Покупка
    //Создаем поля класса name,price,sttus,count
    private String name;
    public int price;
    public String status;
    public int count;
    //Конструктор
    public Shop(String name,int price,String status,int count){
        //name - присваиавается вводимое пользователем название
        this.name=name;
        //Если цена меньше или равна 0, то присваваем её значение 1, тк она не может быть неположительным числом
        if(price>0) {
            this.price = price;
        }
        else{
            this.price=1;
        }
        //статус - присваиваем значение пользователя
        this.status=status;
        //количество товара не может быть неположительным числом, поэтому присваиваем ему значение 1
        if(count>0) {
            this.count = count;
        }
        else{
            this.count=0;
        }
    }
    //метод toString, который будем выводить сведения о покупке
    @Override
    public String toString(){
        return "Shop["+name+":"+price+","+status+","+count+"]";
    }
}
class List_of_shops {//создание класа Список покупок
    //Создание полей класса
    private Shop[] list;//Массив, состоящий из покупок
    private int sum;//Бюджет на совершение покупок
    public List_of_shops(){
        this.list=new Shop[100];//Создаем массив большой ддлины, в котором изначально все элементы null
        this.sum=0;//Изначальный бюджет равен нулю
    }
    //Метод для вывод массива в виде списка покупок
    public String list() {
        String s = "(";//Создаем строку s
        //Идём циклом по длине массива
        for (int i = 0; i < list.length-1; i++) {
            //Если нулевой элемент, то останавливаем вывод
            if (list[i] == null) {
                break;
            } else {
                //Иначе, если элемент после i нулевой, то просто добавляем в строку i элемент
                if (list[i + 1] == null) {
                    s += list[i];
                } else {
                    s += list[i] + ", ";//Если не нулевой, то добавляем i элемент и запятую, тк дальше тоже будет элемент
                }
            }
        }
        s += ")";//Закрываем список по завершению цикла
        return s;//Возвращаем полученную строку
    }
    //Пишем метод addShop для добавления покупок в список
    public void addShop(Shop x){
        int index=0;//Это будет количеситво ненулевых элементов в массиве
        //Идем по циклу, если элемент не ноль увеличиваем счётчик на 1
        for(int i=0;i<list.length;i++) {
            if (list[i] != null) {
                index+=1;
            }
            //Если элемент равен нулю, то добавляем на первое место нулевого элемента,перед которым все ненулевые элементы наш продукт
            if(list[i]==null){
                list[index]=x;
            }
        }
    }
    //Метод addMoney для добавления в бюджет средства
    public int addMoney(int x){
        return sum+=x;
    }
    //Метод mayBuy, который помогает определить возможность покупки того или иного товара
    public String mayBuy(Shop x){
        if(x.price*x.count<=sum){//Если средств в бюджете достаточно для покупки товара, то возвращаем ответ YES
            return "YES";
        }
        else{
            return "NO";//Иначе возвращаем NO
        }
    }
    //Метод buyShop, позволяющий купить покупку из списка, если достаточно средств
    public void buyShop(Shop x){
        //Если достаточно средств на покпку товара, то меняем его статус на куплено и вычитаем из бюджета средства, потраченные на данную покупку
        if(x.price*x.count<=sum){
            x.status="YES";
            sum-=x.price*x.count;
        }
        else{//Иначе не покупаем и статус остаётся NO
            x.status="NO";
        }
    }
    //Метод sumShops считает сумму всех покупок, независо от их статуса
    public int sumShops(){
        int sum_of_shops=0;//счётчик для суммы
        //Идем по массиву, если элемент ненулевой, то добавляем его стоимость в сумму
        for(int i=0;i<list.length;i++){
            if(list[i]!=null) {
                sum_of_shops += list[i].price * list[i].count;
            }
        }
        return sum_of_shops;//Возвращаем сумму
    }
    //Метод sumNotBuyingShops позволяет посчитать сумму, которая необходима для некупленных покупок из списка
    public int sumNotBuyingShops(){
        int sum_not_buying_shops=0;//счётчик суммы
        //Идём по циклу, если элемент ненулевой и его статус NO, то добавляем в сумму его стоимость
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].status=="NO") {
                sum_not_buying_shops += list[i].price * list[i].count;
            }
        }
        return sum_not_buying_shops;//Возвращаем стоимость
    }
    //Метод mayBuyAll проверяет возможность покупки всех товаров из списка
    public String mayBuyAll(){
        int k=0;//Счётчик для суммы
        //идём циклом по длине массива покупок, если элемент ненулевой, то добавдяем в сумму его стоимость
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].status=="NO") {
                k += list[i].price * list[i].count;
            }
        }
        if(k<=sum){
            return "YES";//Если полученная стоимость меньше бюджета пользователя, то возвращаем YES
        }
        else{
            return "NO";//Иначе возвращаем NO
        }
    }
    //Метод notEnoughMoney для подсчёта суммы, нехватающей для покупки всего списка
    public int notEnoughMoney(){
        int k=0;//счётчик для суммы
        //идём циклом по длине массива,если элемент ненулевоё и он не куплен, то добавляем в сумму его стоимость
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].status=="NO") {
                k+= list[i].price * list[i].count;
            }
        }
        if(sum-k<0){//Если недостающая стоисость есть, то возвращаем её
            return (int)Math.abs(sum-k);
        }
        else{
            return 0;//Если денег хватает, то возвращаем 0
        }
    }
    //Метод buyAll - попытка купить все товары из списка
    public String buyAll(){
        int k=0;//Счётчик для суммы всех товаров
        //Идём по массиву циклом, если элемент ненулевой и он не куплен, то добавляем его в сумму
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].status=="NO") {
                k+= list[i].price * list[i].count;
            }
        }
        if(sum-k<0){//Если суммы не хватает на покупку всех товаров то возвращаем сообщение об этом
            return "I can't buy all";
        }
        else{
            //иначе снова идём по циклу и меняем статус всех товаров на  YES, вычитаем из общего бюджета стоимость всех продуктов и возвращаем сообщение, о свершении покупки
            for(int i=0;i<list.length;i++) {
                if (list[i] != null && list[i].status == "NO") {
                    list[i].status = "YES";
                    sum-=k;
                }
            }
            return "I bought!";
        }
    }
    //Метод sortListIncreasing возвращает исходный спискок, в порядке возрастания стоимости
    public void sortListIncreasing(){
        Shop temp;//Создаем переменную типа Shop для сортировки пузырьком
        int index=0;//счётчик для нахождения первого нулевого элемента
        //идём по циклу, если нашли нулевой элемент, то останавливаем циклу и присваеваем index индекс этого элемента
        for(int i=0;i<list.length;i++){
            if(list[i]==null){
                index=i;
                break;
            }
        }
        //Сама сортировка "пузырьком"
        for(int j=1;j<index;j++){//Заводим цикл  j для нахождения без предыдущего элемента, с наибольшей стоимостью
            for(int i=0;i<index-j;i++){//Заводим цикл i  для нахождения без предыдущего элемента, с наибольшей стоимостью
                if(list[i].price*list[i].count>list[i+1].price*list[i+1].count){//если элемент большей следующего, то меняем их местами через переменную
                    temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                }
            }
        }
    }
    //Метод для упорядочиванния списка по убыванию стоимости товаров
    public void sortListDecreasing(){
        Shop temp;//переменная для сортировки
        int index=0;//переменная для индекса первого нулевого элемента
        //Идём по длине массива, если нашли нулевой элемент, то запоминаем его индепкс, прерываем цикл
        for(int i=0;i<list.length;i++){
            if(list[i]==null){
                index=i;
                break;
            }
        }
        //Сама сортировка
        for(int j=1;j<index;j++){//Заводим цикл  j для нахождения без предыдущего элемента, с наименьшей стоимостью
            for(int i=0;i<index-j;i++){//Заводим цикл i  для нахождения без предыдущего элемента, с наименьшей стоимостью
                if(list[i].price*list[i].count<list[i+1].price*list[i+1].count){
                    //Переприсваивание значений
                    temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                }
            }
        }
    }
    //Метод mayBuyAmount для вычисления количества товаров, которые можно купить из некупленных
    public int mayBuyAmount(){
        int k=0;//счётчик количества
        int sum1=0;//счётчик стоисоти товаров
        //Цикл по списку, если статус не кпулено и элемент ненулевой, то добавляем его стоимость в сумму
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].status=="NO"){
                sum1+=list[i].price*list[i].count;
                if(sum1>sum){//Если сумма получислась больше ьюджета, то прерываем цикл
                    break;
                }
                else{//Иначе увеличиваем счётчик на 1(это и будет количество товаров, которые можно купить)
                    k++;
                }
            }
        }
        return k;//Возвращаем количество товаров
    }
    //Метод theCheapest для нахождения самого дешевого товара в списке
    public Shop theCheapest(){
        Shop shop=null;//Создаем переменную типа Shop с нулевым значением, в которой и будет самый дешёвый товар
        int min=Integer.MAX_VALUE;//присваиваем минимума какое-то большое значение
        //Идем по списку циклом и находим элемент с наименьшей стоимостью, запоминаем его стоимость
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].price*list[i].count<min){
                min=list[i].count*list[i].price;
            }
        }
        //Снова идём по списку, если стоимость товара равна минимуму, то присваиваемпеременной shop элемент из спискак
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].price*list[i].count==min){
                shop=list[i];
            }
        }
        return shop;//возвращаем этот товар
    }
    //Метод для находжения самого дорогого товара
    public Shop theMostExpensive(){
        Shop shop=null;//Присваиваем переменной типа Shop  нулевое значение(это и будет самый дорогой товар)
        int max=0;//Обнуляем максимум, в нём будет самая большая стоимость товара
        //Идём циклом по массиву, если находим максимальную стоимость присваиваем её максимуму
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].price*list[i].count>max){
                max=list[i].price*list[i].count;
            }
        }
        //Снова цикл для нахождения самой покупки с наибольшей стоимостью
        for(int i=0;i<list.length;i++){
            if(list[i]!=null&&list[i].price*list[i].count==max){
                shop=list[i];//Если нашли то присваиваем переменной shop значение этого элемента
            }
        }
        return shop;//Возвращаем самый дорогой товар в списке
    }

}
```

### 6. Анализ правильности решения


1. Проверка работы методов addShop,addMoney,list()
    - Input:
        ```
           List_of_shops s=new List_of_shops();
           Shop shop1=new Shop("Milk",100,"NO",1);
           Shop shop2=new Shop("Bread",70,"NO",1);
           Shop shop3=new Shop("Earrings",50000,"NO",1);
           Shop shop4=new Shop("Iphone 15 Pro",100000,"NO",1);
           Shop shop5=new Shop("Sweets",100,"NO",1);
           Shop shop6=new Shop("Tomatoes",50,"NO",3);
           s.addShop(shop5);
           s.addShop(shop6);
           s.addShop(shop4);
           s.addShop(shop1);
           s.addShop(shop2);
           s.addShop(shop3);
           s.addMoney(500);
            System.out.println(s.list());
    
     
        ```

    - Output:
        ```
         (Shop[Sweets:100,NO,1], Shop[Tomatoes:50,NO,3], Shop[Iphone 15 Pro:100000,NO,1], Shop[Milk:100,NO,1], Shop[Bread:70,NO,1], Shop[Earrings:50000,NO,1])
         ```
2.  Проверка методов mayBuy, buyShop, mayBuyAll, buyAll
   - Input:
       ```
           s.buyShop(shop1);
           System.out.println(s.list());
           System.out.println(s.mayBuy(shop1));
           System.out.println(s.mayBuyAll());
           System.out.println(s.buyAll());
           System.out.println(s.list());

       ```

       - Output:
           ```
            (Shop[Sweets:100,NO,1], Shop[Tomatoes:50,NO,3], Shop[Iphone 15 Pro:100000,NO,1], Shop[Milk:100,YES,1], Shop[Bread:70,NO,1], Shop[Earrings:50000,NO,1])
            YES
            NO
            I can't buy all
         ```
     - Output:
     ```
        (Shop[Sweets:100,NO,1], Shop[Tomatoes:50,NO,3], Shop[Milk:100,YES,1], Shop[Bread:70,NO,1])
        YES
        YES
        I bought!
        (Shop[Sweets:100,YES,1], Shop[Tomatoes:50,YES,3], Shop[Milk:100,YES,1], Shop[Bread:70,YES,1])
      ```
3. Тест на правильность вывода в транспонированном виде(Выводиться не исходный массив, а отсортированный)
    - Input:
        ```
      Shop shop1=new Shop("Milk",100,"NO",1);
      Shop shop2=new Shop("Bread",70,"NO",1);
      Shop shop5=new Shop("Sweets",100,"NO",1);
      Shop shop6=new Shop("Tomatoes",50,"NO",3);
      s.addShop(shop5);
      s.addShop(shop6);
      s.addShop(shop1);
      s.addShop(shop2);
      s.addMoney(500);
      System.out.println(s.sumShops());
      System.out.println(s.sumNotBuyingShops());
      System.out.println(s.notEnoughMoney());
        ```

- Output:
    ```
    420
    320
    0
    ```
- Input:
  ```
  Shop shop1=new Shop("Milk",100,"NO",1);
  Shop shop2=new Shop("Bread",70,"NO",1);
  Shop shop3=new Shop("Earrings",50000,"NO",1);
  Shop shop4=new Shop("Iphone 15 Pro",100000,"NO",1);
  Shop shop5=new Shop("Sweets",100,"NO",1);
  Shop shop6=new Shop("Tomatoes",50,"NO",3);
  s.addShop(shop5);
  s.addShop(shop6);
  s.addShop(shop4);
  s.addShop(shop1);
  s.addShop(shop2);
  s.addShop(shop3);
  s.addMoney(500);
  System.out.println(s.sumShops());
  System.out.println(s.sumNotBuyingShops());
  System.out.println(s.notEnoughMoney());
  ```

- Output:
    ```
    150420
    150320
    149920
    ```
  
  4. Проверка сортировки списка покупок по возрастанию и убыванию их цены
      - Input:
          ```
         List_of_shops s=new List_of_shops();
         Shop shop1=new Shop("Milk",100,"NO",1);
         Shop shop2=new Shop("Bread",70,"NO",1);
         Shop shop3=new Shop("Earrings",50000,"NO",1);
         Shop shop4=new Shop("Iphone 15 Pro",100000,"NO",1);
         Shop shop5=new Shop("Sweets",100,"NO",1);
         Shop shop6=new Shop("Tomatoes",50,"NO",3);
         s.addShop(shop5);
         s.addShop(shop6);
         s.addShop(shop4);
         s.addShop(shop1);
         s.addShop(shop2);
         s.addShop(shop3);
         s.addMoney(500);
         s.buyShop(shop1);
         s.sortListIncreasing();
         System.out.println(s.list());
         s.sortListDecreasing();
         System.out.println(s.list());
         s.sortListDecreasing();
         System.out.println(s.list());
          ```

- Output:
    ```
    (Shop[Bread:70,NO,1], Shop[Sweets:100,NO,1], Shop[Milk:100,YES,1], Shop[Tomatoes:50,NO,3], Shop[Earrings:50000,NO,1], Shop[Iphone 15 Pro:100000,NO,1])
    (Shop[Iphone 15 Pro:100000,NO,1], Shop[Earrings:50000,NO,1], Shop[Tomatoes:50,NO,3], Shop[Sweets:100,NO,1], Shop[Milk:100,YES,1], Shop[Bread:70,NO,1])
    ```
5. Тест на правильность работы метода mayBuyAmount

- Input:
    ```
    List_of_shops s=new List_of_shops();
    Shop shop1=new Shop("Milk",100,"NO",1);
    Shop shop2=new Shop("Bread",70,"NO",1);
    Shop shop3=new Shop("Earrings",50000,"NO",1);
    Shop shop4=new Shop("Iphone 15 Pro",100000,"NO",1);
    Shop shop5=new Shop("Sweets",100,"NO",1);
    Shop shop6=new Shop("Tomatoes",50,"NO",3);
    s.addShop(shop5);
    s.addShop(shop6);
    s.addShop(shop4);
    s.addShop(shop1);
    s.addShop(shop2);
    s.addShop(shop3);
    s.addMoney(500);
  
    s.sortListIncreasing();
    System.out.println(s.list());
  
    System.out.println(s.mayBuyAmount());
    ```

- Output:
    ```
    (Shop[Bread:70,NO,1], Shop[Sweets:100,NO,1], Shop[Milk:100,NO,1], Shop[Tomatoes:50,NO,3], Shop[Earrings:50000,NO,1], Shop[Iphone 15 Pro:100000,NO,1])
    4
    ```
6.Тест на правильность нахождения самого дешёвого и дорого товара в списке

- Input:
    ```
    List_of_shops s=new List_of_shops();
    Shop shop1=new Shop("Milk",100,"NO",1);
    Shop shop2=new Shop("Bread",70,"NO",1);
    Shop shop3=new Shop("Earrings",50000,"NO",1);
    Shop shop4=new Shop("Iphone 15 Pro",100000,"NO",1);
    Shop shop5=new Shop("Sweets",100,"NO",1);
    Shop shop6=new Shop("Tomatoes",50,"NO",3);
    s.addShop(shop5);
    s.addShop(shop6);
    s.addShop(shop4);
    s.addShop(shop1);
    s.addShop(shop2);
    s.addShop(shop3);
  
    System.out.println(s.theMostExpensive());
    System.out.println(s.theCheapest());
    ```

  - Output:
      ```
    Shop[Iphone 15 Pro:100000,NO,1]
    Shop[Bread:70,NO,1]
      ```

