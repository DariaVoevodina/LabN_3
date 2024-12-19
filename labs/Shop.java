package labs;

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