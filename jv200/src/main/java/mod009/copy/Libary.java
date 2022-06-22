package mod009.copy;
/**
 * ������ ��� ���������� �ϳ��� ������(�����)�� ���� �� ��ϵȴٰ� ��������.
 * �� �а�(�к�)���� ������ å���� ��� �� ������ ���������� ��ϵǾ�� �Ѵٰ� ��������.
 * å�� ������ �� å�� ������ȣ(serial)�� ���� �˻��Ǿ� ����ȴٰ� ��������.
 * ���������� å�� ������ �� �ִ� ������ �ִ�ġ�� 100���̸�
 * �ʰ��� �ڵ����� ���� ����� ũ���� 2��� �����ȴٰ� ��������.
 *
 *������ = Libary
 *å = Book
 *å���� ��� = addBook(Book book)
 *å ���� = getBook(int serial)
 *
 *
 * @author Administrator
 *
 */
public class Libary { //singleton
	private Book[] books = new Book[100];
	private Libary() {
	}
	private static Libary lib = new Libary();
	public static Libary getLibary() {
		return lib;
	}
	public Book[] getBook() {
		return books;
	}
	public void setBook(Book[] books) {
		this.books = books;
	}
}
