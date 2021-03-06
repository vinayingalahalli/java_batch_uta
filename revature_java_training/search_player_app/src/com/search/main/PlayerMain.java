package com.search.main;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.search.bo.PlayerSearchBO;
import com.search.bo.impl.PlayerSearchBoImpl;
import com.search.exception.BusinessException;
import com.search.team.dao.impl.TeamDaoImpl;
import com.search.to.Player;
import com.search.to.Team;

public class PlayerMain {

	private static Logger log = Logger.getLogger(PlayerMain.class);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		log.info("Welcome to Player Search App V1.0");
		log.info("-----------------------------------");
		int ch = 0;
		PlayerSearchBO bo=new PlayerSearchBoImpl();
		do {
			log.info("Choose option to search Player with below criteria");
			log.info("1)By id");
			log.info("2)By name");
			log.info("3)By dob");
			log.info("4)By gender");
			log.info("5)By teamname");
			log.info("6)Exit");
			log.info("Enter appropriate choice between(1-6)");
			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				ch=0;
			}
			switch (ch) {
			case 1:log.info("Enter Player Id to get player details");
				String id=scanner.nextLine();
				//code here for BO
				try {
					Player player=bo.getPlayerById(id);
					if(player!=null) {
						log.info("Player with id "+id+" found.. details are");
						log.info(player);
					}
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
				break;
			case 2:log.info("under construction.....");

				break;
			case 3:log.info("Enter Player DOB in dd.MM.yyyy format");
				String dob=scanner.nextLine();
				try {
					List<Player> playerList=bo.getPlayersByDob(dob);
					if(playerList!=null && playerList.size()>0) {
						log.info("Total "+playerList.size()+" no of player/s found.. details are");
						for(Player p:playerList) {
							log.info(p);
						}
					}
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
				break;
			case 4:log.info("under construction.....");

				break;
			case 5:List<Team> teamList=null;
				try {
					teamList = new TeamDaoImpl().getAllTeams();
					int i=0;
					for(Team t:teamList) {
						log.info(++i+")"+t.getTname());
					}
					log.info("Choose appropriate team name for eg press 1 for "+teamList.get(0).getTname());
					int choice=Integer.parseInt(scanner.nextLine());
					choice--;
					if(choice<0 || choice>teamList.size()) {
						throw new BusinessException("Invalid Team Choice");
					}
					String teamName=teamList.get(choice).getTname();
					List<Player> playersList=bo.getPlayersByTeamName(teamName);
					if(playersList!=null && playersList.size()>0) {
						log.info("Total "+playersList.size()+" no of player/s found.. details are");
						for(Player p:playersList) {
							log.info(p);
						}
					}
				} catch(NumberFormatException e) {
					log.error("Choose appropriate team name for eg press 1 for "+teamList.get(0).getTname());
				}
				catch (BusinessException e) {
					log.error(e.getMessage());
				}
			
				break;
			case 6:log.info("Thank you for using our player app :)");

				break;
			default:log.error("Invalid choice...... Choice should be number between 1-6 only");
				break;
			}
		} while (ch != 6);

	}

}
