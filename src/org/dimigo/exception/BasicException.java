package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) { //main에서는 사용자에게 오류를 던지면 안되니까 main은 적어도 try catch로 묶어주자
        try {
            uncheckedException(null);
            checkedException();
            String id = null;
            validate(id);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void validate(String id) throws Exception {
        /*요것이 직접 try catch 를 통해 걸러내는 방법과 throws Exception을 써서 오류 던지는 방법 -> main이 아닌 내가 감당하는 메세지는 내가 알아볼 수 있는 오류를 던져줘도 됌.*/
        try{
            if(id == null || "".equals(id)){
                Exception e = new Exception("ID를 입력하세요.");
                throw e;
            }
            if(id.length() < 8){
                throw new Exception("8자 이상 입력하세요");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            throw e; //내가 필요한 오류를 다시 던진다?
        }
    }

    private static void checkedException() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException fne) {
            System.out.println("파일이 없습니다.");
        } catch (IOException ie){
            System.out.println("파일 리딩 시 오류 발생");
        }
    }


    // 컴파일러가 강제적으로 예외처리를 요구하지 않음.
    // 개발자가 알아서 예외처리를 해줘야 함.
    private static void uncheckedException(String s) {
        try{
//            System.out.println(s.length());
            Integer.parseInt("123a");
        } catch(NullPointerException npe){
            System.out.println("문자열이 입력되지 않았습니다.");
        } catch(NumberFormatException nfe){
            System.out.println("숫자가 아닙니다.");
            nfe.printStackTrace(); //개발자용 확인 로고
        } catch (Exception e){
            System.out.println("오류를 모르겠어요.");
            e.printStackTrace();
        }

    }
}
