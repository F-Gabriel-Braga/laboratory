import { Report } from "../model/report";

let reports: Report[] = [];

export class ReportService {

    public static findAll(): Report[] {
        return reports;
    }

    public static addReport(report: Report) {
        reports.push(report);
    }
}