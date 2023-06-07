import { Component, Input } from '@angular/core';
import { Report } from '../model/report';
import { User } from '../model/user';
import { ReportService } from '../service/report-service';

@Component({
  selector: 'reports',
  templateUrl: './reports.component.html',
  styleUrls: ['./reports.component.css']
})
export class ReportsComponent {

  constructor() { }

  @Input()
  public user: User | null = null;

  public listReports: Report[] = ReportService.findAll();

  public listEmpty: boolean = this.listReports.length == 0;

  public addReport(content: string): void {
    ReportService.addReport({
        author: this.user?.username,
        content: content
      });
    this.listReports = ReportService.findAll();
    this.listEmpty = this.listReports.length == 0;
  }

  public markMeeting(description: string, data: string, time: string, link: string): void {
    let content: string = `Reunião! ${description}. Dia ${data} as ${time}. Link: ${link}.`
    this.addReport(content);
  }
}
