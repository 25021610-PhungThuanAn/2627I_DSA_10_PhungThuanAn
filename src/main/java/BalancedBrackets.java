import java.util.ArrayList;
import java.util.Scanner;

public class BalancedBrackets {

    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuoi can kiem tra:");
        String chuoi = sc.nextLine();

        ArrayList<Character> moNgoac = new ArrayList<>();
        moNgoac.add('(');
        moNgoac.add('[');
        moNgoac.add('{');

        ArrayList<Character> dongNgoac = new ArrayList<>();
        dongNgoac.add(')');
        dongNgoac.add(']');
        dongNgoac.add('}');

        boolean isValid = true;

        for (int i = 0; i < chuoi.length(); i++) {
            Character kiTu = chuoi.charAt(i);

            if (moNgoac.contains(kiTu)) {
                myStack.push(kiTu);
            }
            else if (dongNgoac.contains(kiTu)) {
                if (myStack.isEmpty()) {
                    isValid = false;
                    break;
                }

                Character dauMo = myStack.pop();

                if (kiTu.equals(')') && !dauMo.equals('(')) {
                    isValid = false;
                    break;
                } else if (kiTu.equals(']') && !dauMo.equals('[')) {
                    isValid = false;
                    break;
                } else if (kiTu.equals('}') && !dauMo.equals('{')) {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid && myStack.isEmpty()) {
            System.out.println("Chuoi hop le");
        } else {
            System.out.println("Chuoi khong hop le");
        }
    }
}