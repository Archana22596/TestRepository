package com.nonprimitivearray;

public class Playlist {
	public static void listening(Songs[] playlist)
	{
	for (int i = 0; i < playlist.length; i++)
	{
		System.out.println(playlist[i].title);
		System.out.println(playlist[i].duration);
		System.out.println(playlist[i].singer);
	}
	}

	public static void main(String[] args) 
	{
		Songs[] playlist=new Songs[7];
		playlist[0]=new Songs("Teri Meri",4.0,"Rahet Fahet Ali");
		playlist[1]=new Songs("Tagaru",5.0,"Das");
		playlist[2]=new Songs("Rasathi",4.0,"Vineeth Srinivaan");
		playlist[3]=new Songs("Prayuvan",5.0,"Atif");
		playlist[4]=new Songs("Senorita",4.0,"Shawn");
		playlist[5]=new Songs("Tagaru",5.0,"Das");
		playlist[6]=new Songs("Vandemataram",5.0,"B R rahman");
		listening(playlist);
	}

}
