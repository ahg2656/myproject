package pack2;

import java.io.FileWriter;

public class OutfileInterImpl implements OutfileInter{
	private String filePath;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public void outfileProcess(String msg) {
		//메세지를 파일로 출력
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(msg);
			writer.close();
			System.out.println(filePath + " : 저장 완료!");
		} catch (Exception e) {
			System.out.println("outfileProcess err : " + e);
		}
		
	}
}
