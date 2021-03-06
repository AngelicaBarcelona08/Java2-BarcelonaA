import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing06
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		int length = 1;
		int num;
		terminal.enterPrivateMode();
		for(int x=1;x<=20;x=x+2){
			num = (length/2)+(length%2);
			for(int y=1;y<=length;y=y+1){
				terminal.setCursorPosition(11-y,x);
				if(11-y<=10-length+num){
					terminal.putCharacter('X');
				}
				else{
					terminal.putCharacter('Y');
				}
			}
			for(int y=1;y<=length;y=y+1){
				terminal.setCursorPosition(9+y,x);
				if(11-y<=10-length+num){
					terminal.putCharacter('X');
				}
				else{
					terminal.putCharacter('Y');
				}
			}
			terminal.setCursorPosition(10-length,x+1);
			terminal.putCharacter('/');
			terminal.setCursorPosition(10+length,x+1);
			terminal.putCharacter('\\');
			terminal.setCursorPosition(10,x+1);
			terminal.putCharacter('|');
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
