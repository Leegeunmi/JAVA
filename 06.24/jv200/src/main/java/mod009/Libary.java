package mod009;
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
public interface Libary {
	public void addBook(Book book);
	public void getBook(int serial);
	public void getLibary();
}
