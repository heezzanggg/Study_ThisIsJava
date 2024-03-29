package ch08_Interface.test.exam07;

public class MySqlDao implements DataAccessObject {
    // 추상메소드 오버라이딩
    @Override
    public void select() {
        System.out.println("MySql DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("MySql DB에서 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySql DB에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySql DB에서 삭제");
    }

}
