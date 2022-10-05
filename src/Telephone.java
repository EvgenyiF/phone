class Phone implements Callable {
    public void Name (String name){
        System.out.println("*** "+name+" ***");
        }
    @Override
    public void Call() {
        System.out.println("Позвонить");
    }
}

interface Callable {
    void Call();
}

interface SendMessage {
    void SendSMS();
}

interface Emailable extends SendMessage {
    void SendEmail();
}

interface Faxable extends SendMessage {
    void SendFax();
}

class Mobile extends Phone implements SendMessage {

    @Override
    public void SendSMS() {
        System.out.println("СМС");
    }
}

class Smartphone extends Mobile implements Emailable {

    @Override
    public void SendEmail() {
        System.out.println("Отправить письмо");
    }
}

class Facsimile extends Phone implements Faxable {

    @Override
    public void SendSMS() {
   
    }

    @Override
    public void SendFax() {
        System.out.println("Отправить факс");
    }
}
class Landline extends Phone{
    public void Name (){
        System.out.println("Стационарный телефон");
    }
}


public class Telephone {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.Name("Смартфон");
        smartphone.SendEmail();
        smartphone.Call();
        smartphone.SendSMS();
        Mobile mobile = new Mobile();
        mobile.Name("Мобильный телефон");
        mobile.Call();
        mobile.SendSMS();
        Facsimile facsimile = new Facsimile();
        facsimile.Name("Факс");
        facsimile.Call();
        facsimile.SendFax();
        facsimile.SendSMS();
        Landline landline = new Landline();
        landline.Name("Стационарный");
        landline.Call();

    }
}

