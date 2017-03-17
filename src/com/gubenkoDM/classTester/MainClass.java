package com.gubenkoDM.classTester;

/**
 * Created by DmitriX on 16.03.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        //создание экземпляра внутреннего класса и запуск его метода
        OuterClass.InnerClass innerClass=new OuterClass().new InnerClass();
        innerClass.printInner();
        innerClass.a=1;

        //создание экземляра вложенного класса и запуск его метода
        OuterClass.NestedClass nestedClass=new OuterClass.NestedClass();
        nestedClass.printNested();
        nestedClass.b=100;


        //вызовем метод обрамляющего класса в котором есть локальный класс с методом который вызовется внутри этого метода
        //этот метод мы можем вызвать только потому что он статический.
        //для вызова нестатического метода обрамляющего класса придется создать объект обрамляющего класса и из него вызывать этот метод
        OuterClass.printText();

        //создаем объект обрамляющего класса и вызывем его метод в котором создаем объект обрамляющего класса в единственном числе но дополненный методом который выполняем из этого
        //объекта, но доступен для объектов обрамляющего класса не будет, так как метод был добавлен только в качестве анонимного
        OuterClass outCl=new OuterClass();
        outCl.printAnn();

    }
}
