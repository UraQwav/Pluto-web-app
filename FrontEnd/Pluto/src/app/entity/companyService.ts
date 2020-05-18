import {Company} from './company';
import {ServicePriceAndRenewalTime} from './servicePriceAndRenewalTime';
export class CompanyService {
    readonly id;

    company:Company;

    readonly name;

    readonly info;

    readonly imagePath;

    servicePriceAndRenewalTime:ServicePriceAndRenewalTime;
}