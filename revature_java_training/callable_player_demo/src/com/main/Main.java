package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.dao.PlayerDaoImpl;
import com.dao.TeamDaoImpl;
import com.to.Player;
import com.to.Team;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Player details");
		Player player=new Player();
		System.out.println("Player name");
		player.setName(scanner.next());
		System.out.println("Player DOB(dd.MM.yyyy)");
		try {
			player.setDob(new SimpleDateFormat("dd.MM.yyyy").parse(scanner.next()));
		} catch (ParseException e) {
			System.out.println(e);
		}
		System.out.println("Player City");
		player.setCity(scanner.next());
		System.out.println("Player Gender(m/f/o)");
		player.setGender(scanner.next());
		System.out.println("Select Team");
		try {
			List<Team> teamList=new TeamDaoImpl().getAllTeamList();
			int i=0;
			for(Team t:teamList) {
				System.out.println(++i+")"+t.getTname());
			}
			System.out.println("Choose appropriate team name for eg press 1 for "+teamList.get(0).getTname());
			player.setTeam(teamList.get((scanner.nextInt()-1)));
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			player=new PlayerDaoImpl().registerPlayer(player);
			if(player.getId()!=null) {
			System.out.println("Player Registered successfully with id "+player.getId());
			System.out.println("Player details are");
			System.out.println(player);
			}
		} catch (Exception e) {
			System.out.println(e);		}
		
		
	}

}
