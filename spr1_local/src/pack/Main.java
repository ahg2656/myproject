package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//���� �ڹ��� ���
		Message1 message1 = new Message1();
		message1.sayHello("ȫ�浿");
		
		Message2 message2 = new Message2();
		message2.sayHello("ȫ�α�");
		
		MessageInter inter;
		inter = message1;
		inter.sayHello("����");
		
		inter = message2;
		inter.sayHello("���");
		
		System.out.println("-------�Ʒ��� ������ ���---------------");
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter2 = (MessageInter)context.getBean("mes1");
		inter2.sayHello("�տ���");
		inter2 = (MessageInter)context.getBean("mes2");
		inter2.sayHello("���Ȱ�");
	}

}
