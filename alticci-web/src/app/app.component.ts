import { Component } from '@angular/core';
import {AppService} from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  constructor(private appService: AppService) { }

  sequenceIndex: number = null;
  alticciResult: number = null;

  async getAlticciResult(): Promise<void> {
    this.appService.getAlticciSequence(this.sequenceIndex).subscribe((alticciResult) => {
      this.alticciResult = alticciResult;
    });
  }
}
