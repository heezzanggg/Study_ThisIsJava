package ch06_Class.test.exam20;

import java.util.Scanner;

public class BankApplication {

    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택>");
            int selectNo = sc.nextInt();
            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }

    // 계좌생성 메소드
    public static void createAccount() {
        System.out.println("--------");
        System.out.println("계좌생성");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = sc.next();

        System.out.print("계좌주: ");
        String owner = sc.next();

        System.out.print("초기입금액: ");
        int balance = sc.nextInt();

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌목록
    public static void accountList() {
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {
                System.out.print(account.getAno() + "    ");
                System.out.print(account.getOwner() + "    ");
                System.out.println(account.getBalance());
            }
        }

    }

    // 예금
    public static void deposit() {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = sc.next();
        System.out.print("예금액: ");
        int money = sc.nextInt();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("계좌가 없습니다.");
        } else {
            account.setBalance(account.getBalance() + money);
            System.out.println("결과: 예금이 성공되었습니다.");
        }

    }

    // 출금
    public static void withdraw() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");

        System.out.print("계좌번호: ");
        String ano = sc.next();
        System.out.print("출금액: ");
        int money = sc.nextInt();
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("계좌가 없습니다.");
        } else {
            account.setBalance(account.getBalance() - money);
            System.out.println("결과: 출금이 성공되었습니다.");
        }

    }

    // Account 배열에서 ano와 동일한 Account 객체찾기
    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }

}
