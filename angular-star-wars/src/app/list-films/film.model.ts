export interface Result {
    title: string;
    episode_id: string;
    opening_crawl: string;
    director: string;
    producer: string;
    release_date: string;
    created: Date;
    edited: Date;
    version: number;
}

export interface ResponseFilms {
    results: Result[];
}

