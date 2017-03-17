package com.gubenkoDM.classTester;

/**
 * Created by DmitriX on 16.03.2017.
 */
public class OuterClass {
    public String strOuter=new String("OuterString");
    public static String stStr=new String("StaticString");

    //внутренний класс (innerClass). внутрениий это не статический вложенный класс
    //нельзя объявлять внутренние интерфейсы
    public class InnerClass{
        public int a;
        String str="String InnerClass";

        public void printInner(){
            System.out.println(str);
        }
    }

    //вложенный класс (nested class)
    static class NestedClass{
        int b;
        String str="String NestedClass";

        public void printNested(){
            System.out.println(str);
        }
    }

    public static void printOuter(){
        System.out.println(stStr);
    }

    public static void printText(){
        //локальны класс
        //обычно реализуется внутри методов или статических не статических блоках инициализации
        //можно обращаться к метода и переменных обрамляющего класса и переменным метода объявленным с модификатором final
        //за пределами блока объявления локальный класс не виден
        //у локального класса не может быть модификаторов static,public,private,protected
        //внутри локального класса не может быть статичестких полей, методов, классов. Но могут быть константы static final
        //нельзя объявлять локальные интерфейсы
        class LochalClass{
            public void printLochal(){
                System.out.println("Lochal Print!");
            }
        }
        System.out.println("Print Text");
        LochalClass lc=new LochalClass();
        lc.printLochal();

    }

    public void printAnn(){
       //анонимный класс
       //это локальный класс без имени
       new OuterClass(){
            void printAnon(){
                System.out.println("Print Anon text");
            }
       }.printAnon();
    }


}
