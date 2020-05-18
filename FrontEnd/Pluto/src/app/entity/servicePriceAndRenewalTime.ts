export class ServicePriceAndRenewalTime {
    public id:string;
    public price:string;
    public renewalTime:string;
    constructor(id:string ,price:string,renewalTime:string){
        this.id=id;
        this.price = price;
        this.renewalTime = renewalTime;
    }
}