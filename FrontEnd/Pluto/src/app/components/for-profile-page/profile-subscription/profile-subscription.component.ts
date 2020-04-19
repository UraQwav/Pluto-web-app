import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile-subscription',
  templateUrl: './profile-subscription.component.html',
  styleUrls: ['./profile-subscription.component.css']
})
export class ProfileSubscriptionComponent implements OnInit {

  // https://im0-tub-by.yandex.net/i?id=fb53f35e72ccd5d935ab4b774f5788a0&n=13
  items=["https://cnet3.cbsistatic.com/img/GtTpBRFnuafk7V0jYNqsv98j_kc=/2019/07/30/dce6b0e5-dcc5-4ec9-a17d-42afabd70dbb/apple-music-logo-1.jpg","https://avatars.mds.yandex.net/get-zen_doc/34175/pub_5ad4ec211aa80c43803999a9_5ad4f12adcaf8ec3bc731c82/orig","https://i.pinimg.com/originals/1b/99/ea/1b99ea478f564d67eec74331b6a55165.jpg","https://im0-tub-by.yandex.net/i?id=997a4bef82be813329710a9134e95e6a&n=13","http://mediasat.info/wp-content/uploads/2018/08/hbo.jpeg"];
  constructor() { }

  ngOnInit(): void {
  }

}
