package com.jiaxun.library.data;


public class BookData {
	//���
	public BookData() {
		{
			String noreaders= "��";
			for (int i = 0; i < borrowreaders.length; i++) {
				borrowreaders[i]=noreaders;
			}
			for (int i = 0; i < 5; i++) {
				switch (i) {
				case 0:
					booknames[i]="���������塷";
					authors[i]="�޹���";
					pubdates[i]="2016-03-31";
					sumpaginations[i]="1320";
					break;
				case 1:
					booknames[i]="��ˮ䰴���";
					authors[i]="ʩ����";
					pubdates[i]="2015-07-25";
					sumpaginations[i]="1656";
					break;
				case 2:
					booknames[i]="��������¡�";
					authors[i]="������";
					pubdates[i]="2015-01-31";
					sumpaginations[i]="1120";
					break;
				case 3:
					booknames[i]="����ְ֣����ְ֡�";
					authors[i]="���ء�����";
					pubdates[i]="2016-04-04";
					sumpaginations[i]="1310";
					break;
				case 4:
					booknames[i]="���ú�˵����";
					authors[i]="��ִ��";
					pubdates[i]="2012-08-20";
					sumpaginations[i]="9534";
					break;
				}
			}
													
		}
	}

	public String[] booknames = new String[10];// ����
	public String[] authors = new String[10];// ����
	public String[] pubdates = new String[10];// ��������
	public String[] sumpaginations = new String[10];// ��ҳ��
	public String[] borrowreaders = new String[10];// ������

}
