package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Kampanya eklendi " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya güncellendi " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Kampanya silindi " + campaign.getName());
		
	}

}
