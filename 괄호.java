package ������;

class la3 {
	public Boolean is_right_bracket(String u) { // ���Ӽ� �˾ƺ���
        int left_bracket= 0;
        int right_bracket= 0;
        
        for (int i = 0; i < u.length(); i++) {
        	if (u.charAt(i) == '(') {
        		left_bracket += 1;
        	}
        	else {
        		right_bracket += 1;
        		if (right_bracket > left_bracket) {
        			return false;
        		}
        	}
        }
        return true;
	}
	
    public String solution(String p) {
        String answer = "";
        String u = "";
        String v = "";
        if (p.equals("")) {
        	return p;
        }
        String w = p;
        int left_bracket_count = 0;
        int right_bracket_count = 0;
        
        //2. u, v �ϼ�
        for (int i = 0; i < w.length(); i++) {
        	if (w.charAt(i) == '(') {
        		left_bracket_count += 1;
        		u += "(";
        	}
        	else {
        		right_bracket_count += 1;
        		u += ")";
        	}
        	if (left_bracket_count == right_bracket_count) {
        		v = w.substring(i + 1);
        		break;
        	}
        }
        
        //3.
        if (is_right_bracket(u)) {
        	v = solution(v);
        	answer = u + v;
        }
        
        //4.
        else {
        	v = "(" + solution(v) + ")";
        	String remove_u = u.substring(1,u.length()-1);
        	for (int i = 0; i < remove_u.length(); i++) {
        		if (remove_u.charAt(i) == '(') {
        			v += ')';
        		}
        		else {
        			v += '(';
        		}
        	}
        	answer = v;
        }
        
        
        return answer;
    }

}
public class ��ȣ {

	public static void main(String[] args) {
		String bracket = "()))((()";
		la3 la = new la3();
		System.out.println(la.solution(bracket));
	}

}
