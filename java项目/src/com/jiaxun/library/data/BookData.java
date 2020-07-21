package com.jiaxun.library.data;


public class BookData {
	//书库
	public BookData() {
		{
			String noreaders= "无";
			for (int i = 0; i < borrowreaders.length; i++) {
				borrowreaders[i]=noreaders;
			}
			for (int i = 0; i < 5; i++) {
				switch (i) {
				case 0:
					booknames[i]="《三国演义》";
					authors[i]="罗贯中";
					pubdates[i]="2016-03-31";
					sumpaginations[i]="1320";
					break;
				case 1:
					booknames[i]="《水浒传》";
					authors[i]="施耐庵";
					pubdates[i]="2015-07-25";
					sumpaginations[i]="1656";
					break;
				case 2:
					booknames[i]="《成语故事》";
					authors[i]="洪先生";
					pubdates[i]="2015-01-31";
					sumpaginations[i]="1120";
					break;
				case 3:
					booknames[i]="《穷爸爸，富爸爸》";
					authors[i]="伯特·清崎";
					pubdates[i]="2016-04-04";
					sumpaginations[i]="1310";
					break;
				case 4:
					booknames[i]="《好好说话》";
					authors[i]="黄执中";
					pubdates[i]="2012-08-20";
					sumpaginations[i]="9534";
					break;
				}
			}
													
		}
	}

	public String[] booknames = new String[10];// 书名
	public String[] authors = new String[10];// 作者
	public String[] pubdates = new String[10];// 出版日期
	public String[] sumpaginations = new String[10];// 总页数
	public String[] borrowreaders = new String[10];// 借阅人

}
