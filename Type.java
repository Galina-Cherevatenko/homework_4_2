package homework_4_task_2;

public enum Type{
    COW ("корова"),
    CAT ("кошка"),
    DOG("собака"),
    SNAKE("змея");

    String code;
    Type (String code){
        this.code=code;
    }
    String getCode(){return code;}
};
