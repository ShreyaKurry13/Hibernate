package example.hibernate.unidirectional.one_to_many.entity;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cricket_Team_Master")
public class CricketTeam {
    @Id
    @Column(name = "team_id", length = 3)
	private String teamId;
    
    @Column(name = "team_name", length = 20)
	private String name;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
	private Collection<CricketPlayer> players;
	
	public CricketTeam() {
		
	}

	public CricketTeam(String teamId, String name, Collection<CricketPlayer> players) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.players = players;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<CricketPlayer> getPlayers() {
		return players;
	}

	public void setPlayer(Collection<CricketPlayer> players) {
		this.players = players;
	}
	
	public void addPlayer(CricketPlayer player) {
		players.add(player);
	}

	@Override
	public String toString() {
		return "CricketTeam [teamId=" + teamId + ", name=" + name + ", players=" + players + "]";
	}
	
}
