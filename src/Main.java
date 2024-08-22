public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var box = 5;
        System.out.println(box);
        var capacityLeft = 30;
        System.out.println("Можно положить " + capacityLeft + " кг вещей");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        System.out.println("Масса одного боксера — " + firstBoxer + " кг.");
        var secondBoxer = 82.7;
        System.out.println("Масса второго боксера — " + secondBoxer + " кг.");
        var result = firstBoxer + secondBoxer;
        System.out.println("Общая масса боксеров — " + result + " кг.");
        var difference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе - " + difference + " кг!");

        var remainder = secondBoxer % firstBoxer;
        System.out.println("Остаток от деления весов боксеров — " + remainder + " кг.");

        var totalTime = 640;
        System.out.println("Общее время работы - " + totalTime + " часов.");
        var employee = 8;
        System.out.println("Каждый сотрудник отработывал по - " + employee + " часов.");
        var totalEmployees = totalTime / employee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек.");

        var expansion = totalEmployees + 94;
        System.out.println("Расширение штата сотрудников до - " + expansion + " человек.");
        var moreTime = expansion * employee;
        System.out.println("Если в компании работает " + expansion + " человек," + " то всего " + moreTime + " часов работы может быть поделено между сотрудниками.");


    }
}
