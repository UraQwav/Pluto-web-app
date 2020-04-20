import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile-card',
  templateUrl: './profile-card.component.html',
  styleUrls: ['./profile-card.component.css']
})
export class ProfileCardComponent implements OnInit {
  items=["https://freestyler.ws/images/styles_screenshot/5/281/140672_0.png?u=","https://im0-tub-ru.yandex.net/i?id=b3cdcc9aae0de6558af151d10650a1a5&n=33&w=336&h=134","https://sky-wall.ru/uploads/source/2016/02/a3a96fd838619cdc0f7e93739fd63ce0.jpg"];
  constructor() { }

  ngOnInit(): void {
  }

}
