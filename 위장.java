package ������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Camouflage cf = new Camouflage();
		int N = sc.nextInt();
		String[][] clothes = new String[N][2];
		for (int i = 0; i < N; i++) {
			clothes[i][0] = sc.next();
			clothes[i][1] = sc.next();
		}
		System.out.println(cf.Camouflage(clothes));
		sc.close();
	}

}

class Camouflage {
	
    public int Camouflage(String[][] clothes) { // (N,2)
        // [�̸�, ����]
        // ���� �̸� �ǻ� x -> Key
        // �����Ҵ� ���ڿ�
        // ����.(����, ����), (����, �ѿ�)
        HashMap<String, String> closet = new HashMap<>();
        //���� ����
        for (String[] e: clothes) {
        	closet.put(e[0], e[1]);
        }
        List<Entry<String,String>> entry_list = new ArrayList<>(closet.entrySet());
        Collections.sort(entry_list, new Comparator<Entry<String, String>>() {
        	@Override
        	public int compare(Entry<String, String> e1, Entry<String, String> e2) {
        		return e1.getValue().compareTo(e2.getValue());
        	}
        });
        int count = 1;
        int sum = 1;
        for (int i = 0; i < entry_list.size() - 1; i++) {
        	if (entry_list.get(i).getValue().equals(entry_list.get(i + 1).getValue())) {
        		sum++;
        	} else {
        		count *= (sum + 1);
        		sum = 1;
        	}
        }
        count *=(sum + 1);
        count -= 1;
        return count;
    }
}
