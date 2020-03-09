import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
abstract class MyTester {
public static void main(String[] args) {
MarriedPerson mp1 = new MarriedPerson("Tront", "Betty", 31, 980.5f,
Person.FEMALE, 3);
MarriedPerson mp2 = new MarriedPerson("Tront", "Kirk", 31, 2080f,
Person.MALE, 2);
MarriedPerson mp3 = new MarriedPerson("Tront", "Sonia", 31, 600f,
Person.FEMALE, 0);
List<MarriedPerson> mpList = new ArrayList<MarriedPerson>();
mpList.add(mp1);
mpList.add(mp2);
mpList.add(mp3);
Iterator iter = mpList.iterator();
for (MarriedPerson mp : mpList) {
            mp.printInfo();
        }
}
}