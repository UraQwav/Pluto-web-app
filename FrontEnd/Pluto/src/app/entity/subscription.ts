import {User} from './user';
import {CompanyService} from './companyService'
export class  Subscription {
    readonly id;
    readonly subscriptionBuyingTime;
    user:User;
    companyService:CompanyService;
}